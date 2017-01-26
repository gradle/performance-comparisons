package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_286 {
    private final Production19_286 production = new Production19_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}