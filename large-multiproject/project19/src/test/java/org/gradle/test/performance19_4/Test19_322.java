package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_322 {
    private final Production19_322 production = new Production19_322("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}