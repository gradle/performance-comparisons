package org.gradle.test.performance81_3;

import static org.junit.Assert.*;

public class Test81_209 {
    private final Production81_209 production = new Production81_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}