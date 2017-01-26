package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_297 {
    private final Production65_297 production = new Production65_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}