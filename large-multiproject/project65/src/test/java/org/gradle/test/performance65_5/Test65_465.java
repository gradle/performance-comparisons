package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_465 {
    private final Production65_465 production = new Production65_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}