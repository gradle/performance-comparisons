package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_282 {
    private final Production52_282 production = new Production52_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}