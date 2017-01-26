package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_447 {
    private final Production65_447 production = new Production65_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}