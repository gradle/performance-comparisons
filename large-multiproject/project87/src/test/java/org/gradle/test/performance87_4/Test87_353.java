package org.gradle.test.performance87_4;

import static org.junit.Assert.*;

public class Test87_353 {
    private final Production87_353 production = new Production87_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}