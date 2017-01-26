package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_353 {
    private final Production64_353 production = new Production64_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}