package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_89 {
    private final Production65_89 production = new Production65_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}