package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_323 {
    private final Production19_323 production = new Production19_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}