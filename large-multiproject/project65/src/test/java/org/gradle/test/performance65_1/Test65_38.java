package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_38 {
    private final Production65_38 production = new Production65_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}