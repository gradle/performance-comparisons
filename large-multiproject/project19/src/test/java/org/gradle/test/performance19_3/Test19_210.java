package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_210 {
    private final Production19_210 production = new Production19_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}