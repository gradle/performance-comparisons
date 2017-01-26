package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_44 {
    private final Production65_44 production = new Production65_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}