package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_500 {
    private final Production65_500 production = new Production65_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}