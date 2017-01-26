package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_26 {
    private final Production34_26 production = new Production34_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}