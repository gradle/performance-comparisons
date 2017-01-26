package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_257 {
    private final Production65_257 production = new Production65_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}