package org.gradle.test.performance65_5;

import static org.junit.Assert.*;

public class Test65_495 {
    private final Production65_495 production = new Production65_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}