package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_444 {
    private final Production52_444 production = new Production52_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}