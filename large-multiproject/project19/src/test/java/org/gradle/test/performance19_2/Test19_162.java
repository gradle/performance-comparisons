package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_162 {
    private final Production19_162 production = new Production19_162("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}