package org.gradle.test.performance52_2;

import static org.junit.Assert.*;

public class Test52_107 {
    private final Production52_107 production = new Production52_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}