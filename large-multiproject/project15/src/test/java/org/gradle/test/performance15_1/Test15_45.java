package org.gradle.test.performance15_1;

import static org.junit.Assert.*;

public class Test15_45 {
    private final Production15_45 production = new Production15_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}