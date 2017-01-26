package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_253 {
    private final Production81_253 production = new Production81_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}