package org.gradle.test.performance34_3;

import static org.junit.Assert.*;

public class Test34_243 {
    private final Production34_243 production = new Production34_243("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}