package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_209 {
    private final Production52_209 production = new Production52_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}