package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_62 {
    private final Production19_62 production = new Production19_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}