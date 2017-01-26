package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_305 {
    private final Production65_305 production = new Production65_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}