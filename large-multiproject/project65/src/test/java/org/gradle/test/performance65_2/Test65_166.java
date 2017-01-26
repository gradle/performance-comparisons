package org.gradle.test.performance65_2;

import static org.junit.Assert.*;

public class Test65_166 {
    private final Production65_166 production = new Production65_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}