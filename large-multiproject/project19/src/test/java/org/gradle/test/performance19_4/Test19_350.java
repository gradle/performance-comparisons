package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_350 {
    private final Production19_350 production = new Production19_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}