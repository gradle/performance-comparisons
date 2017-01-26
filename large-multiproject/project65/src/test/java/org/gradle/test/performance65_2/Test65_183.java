package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_183 {
    private final Production65_183 production = new Production65_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}