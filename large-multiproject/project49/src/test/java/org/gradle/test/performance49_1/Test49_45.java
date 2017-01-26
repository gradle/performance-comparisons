package org.gradle.test.performance49_1;

import static org.junit.Assert.*;

public class Test49_45 {
    private final Production49_45 production = new Production49_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}