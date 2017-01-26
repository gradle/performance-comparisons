package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_281 {
    private final Production19_281 production = new Production19_281("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}