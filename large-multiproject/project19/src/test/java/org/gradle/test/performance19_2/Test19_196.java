package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_196 {
    private final Production19_196 production = new Production19_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}