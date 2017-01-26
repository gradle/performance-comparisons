package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_415 {
    private final Production65_415 production = new Production65_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}