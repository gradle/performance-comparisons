package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_307 {
    private final Production19_307 production = new Production19_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}