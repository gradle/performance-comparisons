package org.gradle.test.performance94_5;

import static org.junit.Assert.*;

public class Test94_445 {
    private final Production94_445 production = new Production94_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}