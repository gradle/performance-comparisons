package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_228 {
    private final Production19_228 production = new Production19_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}