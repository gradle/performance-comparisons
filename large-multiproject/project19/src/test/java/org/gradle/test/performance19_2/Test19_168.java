package org.gradle.test.performance19_2;

import static org.junit.Assert.*;

public class Test19_168 {
    private final Production19_168 production = new Production19_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}