package org.gradle.test.performance19_1;

import static org.junit.Assert.*;

public class Test19_89 {
    private final Production19_89 production = new Production19_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}