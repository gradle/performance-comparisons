package org.gradle.test.performance94_1;

import static org.junit.Assert.*;

public class Test94_41 {
    private final Production94_41 production = new Production94_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}