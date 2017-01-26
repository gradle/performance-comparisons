package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_61 {
    private final Production19_61 production = new Production19_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}