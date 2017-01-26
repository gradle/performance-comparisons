package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_168 {
    private final Production65_168 production = new Production65_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}