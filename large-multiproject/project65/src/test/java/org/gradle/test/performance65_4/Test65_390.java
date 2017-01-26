package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_390 {
    private final Production65_390 production = new Production65_390("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}