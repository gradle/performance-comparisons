package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_253 {
    private final Production19_253 production = new Production19_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}