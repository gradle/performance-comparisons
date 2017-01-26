package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_5 {
    private final Production34_5 production = new Production34_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}