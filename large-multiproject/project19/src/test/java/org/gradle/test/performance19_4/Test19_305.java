package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_305 {
    private final Production19_305 production = new Production19_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}