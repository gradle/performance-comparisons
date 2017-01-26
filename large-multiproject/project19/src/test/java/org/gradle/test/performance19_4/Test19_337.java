package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_337 {
    private final Production19_337 production = new Production19_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}