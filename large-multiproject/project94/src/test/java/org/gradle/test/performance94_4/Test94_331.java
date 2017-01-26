package org.gradle.test.performance94_4;

import static org.junit.Assert.*;

public class Test94_331 {
    private final Production94_331 production = new Production94_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}