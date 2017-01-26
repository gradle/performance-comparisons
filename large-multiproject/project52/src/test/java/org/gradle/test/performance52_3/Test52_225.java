package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_225 {
    private final Production52_225 production = new Production52_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}