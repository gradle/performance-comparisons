package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_89 {
    private final Production52_89 production = new Production52_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}