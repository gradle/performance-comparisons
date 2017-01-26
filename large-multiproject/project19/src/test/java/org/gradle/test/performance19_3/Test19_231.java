package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_231 {
    private final Production19_231 production = new Production19_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}