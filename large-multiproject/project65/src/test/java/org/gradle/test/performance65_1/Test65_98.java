package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_98 {
    private final Production65_98 production = new Production65_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}