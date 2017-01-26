package org.gradle.test.performance19_4;

import static org.junit.Assert.*;

public class Test19_353 {
    private final Production19_353 production = new Production19_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}