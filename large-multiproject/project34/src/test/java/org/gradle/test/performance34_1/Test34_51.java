package org.gradle.test.performance34_1;

import static org.junit.Assert.*;

public class Test34_51 {
    private final Production34_51 production = new Production34_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}