package org.gradle.test.performance2_2;

import static org.junit.Assert.*;

public class Test2_183 {
    private final Production2_183 production = new Production2_183("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}