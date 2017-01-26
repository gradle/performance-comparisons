package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_260 {
    private final Production19_260 production = new Production19_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}