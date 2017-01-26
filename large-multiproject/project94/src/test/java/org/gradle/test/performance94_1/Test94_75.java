package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_75 {
    private final Production94_75 production = new Production94_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}