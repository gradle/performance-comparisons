package org.gradle.test.performance19_3;

import static org.junit.Assert.*;

public class Test19_282 {
    private final Production19_282 production = new Production19_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}